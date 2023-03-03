def import _fasta_scanner
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _fasta_scanner
        K = sc.__next__ ( )
        A = sc.__next__ ( K )
        print ( solve ( ) )
    def solve ( self ) :
        min = 2
        max = 2
        for a in A [ K - 1 : : - 1 ] :
            if min % a != 0 and max % a != 0 :
                min_q = min / a
                max_q = max / a
                if not ( min_q < max_q ) :
                    return '-1'
            min = min % a == 0 and min or ( ( min / a ) + 1 ) * a
            max = ( max / a ) * a + ( a - 1 )
        return min , max
    @ property
    def readline ( self ) :
        if not self._fasta_scanner or not self._fasta_scanner :
            try :
                self._fasta_scanner = _fasta_scanner
            except :
                self._fasta_scanner = _fasta_scanner
        return self._fasta_scanner
