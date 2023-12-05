def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            S = sc.read ( ).replace ( "Left" , "<" ).replace ( "Right" , ">" ).replace ( "AtCoder" , "A" )
            print ( S )
    return Main ( )
