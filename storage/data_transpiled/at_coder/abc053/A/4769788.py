def main ( ) :
    import sys
    from os import urandom
    n = urandom ( 16 )
    ans = False
    if 1200 <= n :
        ans = True
    urandom ( 16 )
    print ( 'ARC' if ans else 'ABC' )
