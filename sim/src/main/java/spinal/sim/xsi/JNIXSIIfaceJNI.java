/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package spinal.sim.xsi;

public class JNIXSIIfaceJNI {
  public final static native long new_VecI8__SWIG_0();
  public final static native long new_VecI8__SWIG_1(long jarg1, VecI8 jarg1_);
  public final static native long VecI8_capacity(long jarg1, VecI8 jarg1_);
  public final static native void VecI8_reserve(long jarg1, VecI8 jarg1_, long jarg2);
  public final static native boolean VecI8_isEmpty(long jarg1, VecI8 jarg1_);
  public final static native void VecI8_clear(long jarg1, VecI8 jarg1_);
  public final static native long new_VecI8__SWIG_2(int jarg1, byte jarg2);
  public final static native int VecI8_doSize(long jarg1, VecI8 jarg1_);
  public final static native void VecI8_doAdd__SWIG_0(long jarg1, VecI8 jarg1_, byte jarg2);
  public final static native void VecI8_doAdd__SWIG_1(long jarg1, VecI8 jarg1_, int jarg2, byte jarg3);
  public final static native byte VecI8_doRemove(long jarg1, VecI8 jarg1_, int jarg2);
  public final static native byte VecI8_doGet(long jarg1, VecI8 jarg1_, int jarg2);
  public final static native byte VecI8_doSet(long jarg1, VecI8 jarg1_, int jarg2, byte jarg3);
  public final static native void VecI8_doRemoveRange(long jarg1, VecI8 jarg1_, int jarg2, int jarg3);
  public final static native void delete_VecI8(long jarg1);
  public final static native long new_XSIIface();
  public final static native void delete_XSIIface(long jarg1);
  public final static native int XSIIface_get_signal_handle(long jarg1, XSIIface jarg1_, String jarg2);
  public final static native long XSIIface_read(long jarg1, XSIIface jarg1_, int jarg2, int jarg3);
  public final static native long XSIIface_read64(long jarg1, XSIIface jarg1_, int jarg2);
  public final static native int XSIIface_read32(long jarg1, XSIIface jarg1_, int jarg2);
  public final static native void XSIIface_write(long jarg1, XSIIface jarg1_, int jarg2, int jarg3, long jarg4, VecI8 jarg4_);
  public final static native void XSIIface_write64(long jarg1, XSIIface jarg1_, int jarg2, long jarg3);
  public final static native void XSIIface_write32(long jarg1, XSIIface jarg1_, int jarg2, int jarg3);
  public final static native void XSIIface_sleep(long jarg1, XSIIface jarg1_, long jarg2);
  public final static native void XSIIface_check_status(long jarg1, XSIIface jarg1_);
}
