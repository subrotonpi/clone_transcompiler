def import _main
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        with self.open ( 'r' ) as f :
            s = f.read ( )
        i = 0
        builder = [ ]
        while i < len ( s ) :
            ch = s [ i ]
            count = self._count_char ( s [ i : ] , ch )
            builder.append ( '%c%d' % ( ch , count ) )
            i += count
        print ( '\n'.join ( builder ) )
    def count_char ( self , ch ) :
        count = 0
        for i , c in enumerate ( s ) :
            if c == ch :
                count += 1
            else :
                break
        return count
