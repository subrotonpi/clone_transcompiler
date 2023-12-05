def main ( ) :
    import sys
    import token
    if len ( sys.argv ) == 1 :
        sys.argv = sys.argv + [ "Include/graminit.h" , "Lib/symbol.py" ]
    token.main ( )
