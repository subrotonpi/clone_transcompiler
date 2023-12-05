def main ( ) :
    import string
    import sys
    from itertools import count
    from itertools import chain
    A = string.ascii_lowercase
    cnt = [ 0 ] * 26
    cnt [ A [ 0 ] - 'a' ] += 1
    ans = ( sum ( A ) ** 2 ) / 2 + 1
    for num in cnt :
        ans -= ( num * ( num - 1 ) ) / 2
    print ( ans )
