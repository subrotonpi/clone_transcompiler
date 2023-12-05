def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sn = sys.stdin.readline ( )
            word = self.sn.readline ( )
            word = word.replace ( 'a' , '' )
            word = word.replace ( 'i' , '' )
            word = word.replace ( 'u' , '' )
            word = word.replace ( 'e' , '' )
            word = word.replace ( 'o' , '' )
            print ( word )
    return Main
