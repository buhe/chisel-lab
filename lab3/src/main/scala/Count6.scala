import chisel3._

class Count6 extends Module {
  val io = IO(new Bundle {
    val dout = Output(UInt(8.W))
  })

  val res = RegInit(0.U(32.W))

  // ***** your code starts here *****
  // res := 0.U
  res := res + 1.U // dummy code to make it compile
  when(res === 6.U) {
    res := 0.U
  }

  // ***** your code ends here *****

  io.dout := res
}