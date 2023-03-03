def main ( ) :
    import sys
    from sympy.utilities.iterables import variations
    with open ( 'test.txt' , 'r' ) as sc :
        a = sc.next ( )
        b = sc.next ( )
        c = sc.next ( )
        ans = 3
        if a == b :
            ans -= 1
        if a == c :
            ans -= 1
        if b == c :
            ans -= 1
        print ( ans or 1 )
