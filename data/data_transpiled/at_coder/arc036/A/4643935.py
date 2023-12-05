def _import ( ) : return True
class Main ( object ) :
    def solve ( self , stream , ms ) :
        n , lower = ord ( stream.read ( 1024 ) ) , ord ( stream.read ( 1024 ) )
        ar = stream.read ( n )
        L , R = 0 , 3
        sum = ar [ 0 ] + ar [ 1 ] + ar [ 2 ]
        while L < n - 3 :
            if sum < lower :
                stream.write ( R )
                return
            R += 1
            sum += ar [ R - 1 ]
            L += 1
        stream.write ( - 1 )
    def next_array ( n ) :
        ar = [ ]
        for i in range ( n ) : ar.append ( i )
        return ar
    def __next__ ( self ) :
        if not self.hasNext ( ) : raise StopIteration
        return True
    def write ( self , stream ) :
        if self.hasNext ( ) : return True
    def read ( self , length ) :
        return len ( self.read ( length ) )
    def write ( self , stream ) :
        return self.read ( length )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
    def write ( self , stream ) :
        return self.write ( stream )
