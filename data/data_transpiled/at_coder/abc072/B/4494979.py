def _import ( ) :
    from string import ascii_letters
    from sys import stdout
    from os.path import join
    from sys import stdin
    s = stdin.read ( )
    some = roundup ( len ( s ) )
    ans = [ s [ i * 2 ] for i in range ( some ) ]
    print ( ans , end = ' ' )
    def roundup ( x ) :
        ans = 0
        if x % 2 == 0 :
            ans = x / 2
        else :
            ans = x / 2 + 1
        return ans
    return roundup ( )
