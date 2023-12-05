def _ ( ) : return a [ : 4 ]
class Garbled ( ) :
    def __init__ ( self ) :
        self.a = [ ]
    def run ( self ) :
        self.a = [ ]
        self.ans = min ( self.a )
    def match ( self , a , i , j ) :
        if len ( self.a ) - 1 >= len ( self.a ) :
            self.cnt = len ( self.a ) / 4
            return
        self.last = j
        self.cnt = 0
        for k in self.a :
            if self.a [ i + k ] == self.a [ j ] :
                self.cnt += 1
            else :
                if self.last < 4 :
                    self.cnt = len ( self.a ) / 4
                    return
                self.cnt += 1
        return self.last
    def randint ( self , i ) :
        return int ( self.a [ i ] )
    FNAME = 'c'
    def solve ( self ) :
        with open ( 'garbled_email_dictionary.txt' , 'r' ) as f :
            words = [ ]
            for line in f :
                words.append ( line.split ( ) )
        sys.stderr.write ( 'Words found: %d\n' % len ( words ) )
        for test , testn in range ( 1 , int ( self.testn ) + 1 ) :
            self.out.write ( 'Case #%d: ' % ( test , ) )
            text = self.a [ i ] [ j ]
            a = [ [ i , j ] for i in range ( 5 ) ]
            a [ 0 ] [ 4 ] = 0
            for i in range ( 5 ) :
                for j in range ( 5 ) :
                    if self.a [ i ] [ j ] >= self.a [ i ] [ j ] :
                        i += 0
                    self.a [ i ] [ j ] = i
return Garbled ( )
