def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.data = sys.stdin.read ( )
            self.a = ''
            self.a = self.data.replace ( 'a' , '' )
            self.b = self.a.replace ( 'i' , '' )
            self.c = self.b.replace ( 'u' , '' )
            self.d = self.c.replace ( 'e' , '' )
            self.e = self.d.replace ( 'o' , '' )
            print ( self.e )
