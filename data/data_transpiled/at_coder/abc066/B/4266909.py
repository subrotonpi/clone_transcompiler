def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os import sep
    from sys import stdin
    s = stdin.read ( )
    stdin.close ( )
    n = len ( s )
    ans = 0
    for i in range ( n // 2 + 1 ) :
        fs = sep.join ( [ s [ : i ] , s [ i : 2 * i ] ] )
        ls = sep.join ( [ s [ i : 2 * i ] , s [ 2 * i : ] ] )
        if fs == ls :
            if i * 2 == n :
                break
            ans = i * 2
    print ( ans )
