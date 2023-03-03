def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_COMPILED
    with open ( "../../../code/corellia/common/misc/misc/misc/misc.py" , "r" ) as f :
        A = eval ( f.read ( ) )
        B = eval ( f.read ( ) )
        C = eval ( f.read ( ) )
        if A [ - 1 ] == B [ 0 ] and B [ - 1 ] == C [ 0 ] :
            print ( "YES" )
        else :
            print ( "NO" )
