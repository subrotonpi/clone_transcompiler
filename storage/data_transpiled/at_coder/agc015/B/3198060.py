def import import sys , string , c_int , sizeof
from ctypes.util import find_buffer
from ctypes.wintypes import DWORD , HANDLE , WINFUNCTYPE , BOOL , DWORD
class Main ( object ) :
    def __init__ ( self ) :
        sc = _DWORD ( )
        s = sc.value
        ans = 0
        for i in range ( len ( s ) ) :
            if s [ i ] == 'U' :
                ans += len ( s ) - i - 1 + 2 * ( i )
            else :
                ans += i + 2 * ( len ( s ) - i - 1 )
        self.out.write ( ans )
