def _ ( ) : return open ( PROBLEM + "-" + SIZE + ".in" , "r" ).read ( )
class A :
    PROBLEM = "A"
    SIZE = "large"
    def solve ( self ) :
        r = randint ( 0 , len ( self.PROBLEM ) )
        c = randint ( 0 , len ( self.PROBLEM ) )
        f = [ ]
        for i in range ( r ) :
            f.append ( self.nextToken ( ).split ( ) )
            if len ( f [ i ] ) != c :
                raise
        for i in range ( r ) :
            for j in range ( c ) :
                if f [ i ] [ j ] == '#' :
                    if i < r - 1 and j < c - 1 and f [ i ] [ j + 1 ] == '#' and f [ i + 1 ] [ j ] == '#' and f [ i + 1 ] [ j + 1 ] == '#' :
                        f [ i ] [ j ] = '/'
                        f [ i ] [ j + 1 ] = ' \ \'
                        f [ i + 1 ] [ j ] = ' \ \'
                        f [ i + 1 ] [ j + 1 ] = '/'
                    else :
                        return '\nImpossible'
        f = [ ]
        for row in f :
            f.append ( '\n'.join ( row ) )
        return ''.join ( f )
    def read ( self ) :
        try :
            return open ( self.PROBLEM + "-" + SIZE + ".in" , "r" ).read ( )
        except IOError :
            pass
        else :
            return ''
    def write ( self , * args ) :
        try :
            return open ( self.PROBLEM + "-" + SIZE + ".in" , "w" ).write ( "\n" )
        except IOError :
            pass
    write ( self , * args )
    return write
