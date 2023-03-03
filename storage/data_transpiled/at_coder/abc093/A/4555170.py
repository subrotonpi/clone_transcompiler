def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a = sc.read ( )
            if a in [ 'abc' , 'acb' , 'bac' , 'bca' , 'cab' , 'cba' ] :
                print ( "Yes" )
            else :
                print ( "No" )
