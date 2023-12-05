def main ( ) :
    import sys
    from sympy import gcd
    from sympy.core.compatibility import builtins
    from sympy.core.containers import gcd
    from sympy.core.compatibility import builtins
    n = len ( builtins.open ( '/dev/null' , 'r' ).readlines ( ) )
    ans = 1
    for i in range ( n ) :
        im = gcd ( * ans.read ( ) )
        ans = ans * im // gcd ( ans , im )
    builtins.open ( '/dev/null' , 'r' ).write ( str ( ans ) )
