model type float32 = int;

//// Converts an integer to float
model fun IntToFloat32(val: int) : float32
{
   return default(float32); 
} 

model fun AddFloat32(op1: float32, op2: float32) : float32
{
   return default(float32);
} 

main machine Main {
  start state Init {
    entry {
      var f: float32;
      f = IntToFloat32(1);
      f = AddFloat32(f, IntToFloat32(1000)); 
    }
  }
}
