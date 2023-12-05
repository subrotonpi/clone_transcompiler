def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    from sympy.printing.latex import Printer
    with open ( "test.txt" , "r" ) as sc :
        A = sc.choice ( [ "a" , "b" , "c" ] )
        B = sc.choice ( [ "a" , "b" , "c" ] )
        C = sc.choice ( [ "a" , "b" , "c" ] )
        ans = "NO"
        for i in range ( 0 , 100 ) :
            if A * i % B == C :
                ans = "YES"
                break
        print ( ans )
