import os
from .basic_csharp_translator import PProgramToCSharpTranslator

class PProgramToSymbolicCSharpTranslator(PProgramToCSharpTranslator):
    runtime_dir = os.environ.get("RUNTIME_DIR", os.path.realpath(os.path.dirname(__file__) + "/../runtimes/symbolic_csharp"))
    
    def __init__(self, *args):
        super(PProgramToCSharpTranslator, self).__init__(*args)

    def is_call_exp(self, exp_ast):
        if exp_ast.is_token:
            return False
        if exp_ast.getChildCount() == 1:
            return self.is_call_exp(exp_ast.getChild(0))
        else:
            return exp_ast.name in ("exp_call", "exp_call_with_arguments")

    def visitBinary_Exp(self, ctx, **kwargs):
        if ctx.getChildCount() > 1:
            op = ctx.getChild(1).getText()
            c0 = ctx.getChild(0).accept(self, **kwargs)
            c2 = ctx.getChild(2).accept(self, **kwargs)
            if not self.is_call_exp(ctx.getChild(2)):
                if op == "&&":
                    op = "&"
                elif op == "||":
                    op = "|"
            return "{0} {1} {2}".format(c0, op, c2)
        else:
            return ctx.getChild(0).accept(self, **kwargs)

    visitExp = visitBinary_Exp
    visitExp_7 = visitBinary_Exp
    

Translator = PProgramToSymbolicCSharpTranslator
