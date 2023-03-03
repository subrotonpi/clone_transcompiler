def main ( ) :
    import sys
    class Main ( object ) :
        @ staticmethod
        def __init__ ( self ) :
            self.w = sys.stdin.read ( )
            while len ( self.w ) % 2 == 0 and self.w != '' :
                self.w = self.w.replace ( str ( self.w [ 0 ] ) , '' )
            if len ( self.w ) == 0 :
                self.print ( 'Yes' )
            else :
                self.print ( 'No' )
