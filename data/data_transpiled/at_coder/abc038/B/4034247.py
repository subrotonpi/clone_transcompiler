def _import ( ) : return _fasta_read ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._fasta_read = _fasta_read ( )
    def read ( self ) :
        self._fasta_read = _fasta_read ( )
    def read ( self ) :
        if self._fasta_read < 0 or self._fasta_read < 0 :
            raise ValueError ( )
        while True :
            if self._fasta_read <= 0 and self._fasta_read <= 0 :
                self._fasta_read *= 10
                self._fasta_read += 1
            elif self._fasta_read == - 1 or self._fasta_read == - 1 :
                self._fasta_read = _fasta_read
            else :
                self._fasta_read = _fasta_read
    def read ( self ) :
        nl = self._fasta_read
        if nl < int ( self._fasta_read ) or nl > int ( self._fasta_read ) :
            raise ValueError ( )
        return int ( nl )
    def write ( self , data ) :
        return float ( next ( data ) )
    def count_topoogical_sort ( G ) :
        n = len ( G )
        dp = [ 1 ] * ( 1 << n )
        for i in range ( ( 1 << n ) ) :
            for j in range ( n ) :
                if ( ( i >> j ) & 1 ) == 1 :
                    continue
                tf = True
                for to in G [ j ] :
                    if ( ( i >> to ) & 1 ) == 1 :
                        tf = False
                        break
                if not tf :
                    continue
                dp [ i | ( 1 << j ) ] += dp [ i ]
        return dp [ ( 1 << n ) - 1 ]
class FastScanner ( object ) :
    def __init__ ( self ) :
        self._fasta_read = _fasta_read ( )
    def read ( self ) :
        self._fasta_read = _fasta_read ( )
    def write ( self , data ) :
        self._fasta_write = _fasta_write
