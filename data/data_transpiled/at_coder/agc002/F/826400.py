def _import ( ) : return sys.stdin
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import sys
class Main ( csv.DictReader ) :
    def __init__ ( self , stream ) :
        csv.reader.csv = csv
        self.stream = stream ,
    def next ( self ) :
        try :
            self.stream = csv.reader.csv
        except csv.Error :
            raise
        return self.stream.next ( )
    def solve ( self , test_number , infile , outfile ) :
        n = self.stream.select ( ) [ 0 ]
        k = self.stream.select ( ) [ 0 ]
        if k == 1 :
            outfile.write ( 1 )
            return
        invs = [ 1 ]
        for i in range ( 2 , len ( invs ) ) :
            invs [ i ] = ( MODULO - ( MODULO / i ) * invs [ ( int ( MODULO % i ) ) ] % MODULO ) % MODULO
        invprod = 1
        for i in range ( 1 , k - 2 ) :
            invprod = invprod * invs [ i ] % MODULO
        ways = [ 1 ]
        sufprods = [ 1 ]
        for i in range ( 1 , n ) :
            nways = [ ]
            sum = 0
            prefprod = 1
            upto = sys.maxint
            for newz in nways :
                if newz > 1 :
                    sum += ways [ newz - 2 ]
                    sum %= MODULO
                need = ( i + 1 ) * k - newz - 1
                if upto < ( need - ( k - 2 ) ) :
                    upto = need
                    sufprods.append ( 1 )
                    for j in range ( 1 , len ( sufprods ) ) :
                        sufprods [ j ] = sufprods [ j - 1 ] * ( j + 1 ) % MODULO
        return sum
