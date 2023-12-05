def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    from sympy.printing.latex import Printer
    with open ( "test.txt" , "r" ) as f :
        a = int ( f.read ( ) )
        b = int ( f.read ( ) )
        product = a * b
        if product % 2 == 1 :
            print ( "Odd" , end = "" )
        else :
            print ( "Even" , end = "" )
