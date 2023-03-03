def main ( args ) :
    import sys
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import QQ
    from sympy.core.compatibility import PYQQ
    from sympy.core.compatibility import PYQQ
    from sympy.core.compatibility import PYQQ
    from sympy.core.compatibility import PYQQ
    from sympy.core.compatibility import PYQQ
    W = sys.maxsize - 1
    H = sys.maxsize - 1
    mod = 1000000007
    num = conv ( W + H , W , mod )
    print ( num )
    def conv ( m , n , mod ) :
        num = 1
        for i in range ( int ( n ) + 1 , int ( m ) + 1 ) :
            num = num * i % mod
        num2 = 1
        for i in range ( 1 , m - n + 1 ) :
            num2 = num2 * i % mod
        big2 = QQ.from_sympy ( str ( num2 ) )
        modb = QQ.from_sympy ( str ( mod ) )
        ans = num * int ( big2.modInverse ( modb ) [ 0 ] ) % mod
        return ans
    return conv
