def main ( ) :
    import sys
    from string import atoi
    from math import log
    sc = Scanner ( )
    Astr , Bstr , Cstr = sc.next ( ).split ( )
    A = int ( Astr )
    B = int ( Bstr )
    C = int ( Cstr )
    ans = 0
    if A + B >= C :
        ans = B + C
    else :
        ans = A + 2 * B + 1
    print ( ans )
