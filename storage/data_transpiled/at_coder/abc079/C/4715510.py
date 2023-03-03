def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    sc = Scanner ( )
    s = sc.next ( )
    a , b , c , d = map ( int , s.split ( ',' ) )
    sc.next ( )
    ifplus = [ True , False ]
    for op1 in ifplus :
        for op2 in ifplus :
            for op3 in ifplus :
                ans = a
                ans += b if op1 else - b
                ans += c if op2 else - c
                ans += d if op3 else - d
                if ans == 7 :
                    parts = a + '+' if op1 else '-'
                    parts += b + '+' if op2 else '-'
                    parts += c + '+' if op3 else '-'
                    parts += d + '=7'
                    print ( ' '.join ( parts ) )
                    sys.exit ( )
