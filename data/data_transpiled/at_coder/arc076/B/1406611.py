def _import ( ) : return sys.stdout
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
class Main :
    def __init__ ( self , size ) :
        self.parent = [ ]
        self.parent = [ ]
        self.parent.append ( - 1 )
    def union ( self , x , y ) :
        self.parent.append ( x )
        self.parent [ y ] = self.parent [ y ]
        return True
    def is_connected ( self , x , y ) :
        return self.parent [ x ] == self.parent [ y ]
    def select ( self , size ) :
        self.parent.append ( x )
        self.parent [ x ] = self.parent [ y ]
        self.parent [ y ] = self.parent [ x ]
        return False
    def select ( self , size ) :
        self.parent.append ( x )
        self.parent [ x ] = self.parent [ y ]
        self.parent [ y ] = self.parent [ x ]
        return True
    def select ( self , size ) :
        self.parent.append ( x )
        self.parent [ x ] = self.parent [ y ]
        self.parent [ y ] = self.parent [ x ]
        return True
    def select ( self , size ) :
        self.parent.append ( x )
        self.parent [ x ] = self.parent [ y ]
        self.parent [ y ] = self.parent [ x ]
        return True
    def select ( self , size ) :
        self.parent = [ ]
        self.parent.append ( x )
        self.parent [ x ] = self.parent [ x ]
        self.parent [ y ] = self.parent [ y ]
        return True
    def select ( self , size ) :
        self.parent = [ ]
        self.parent.append ( x )
        self.parent.append ( y )
        self.parent [ x ] = self.parent [ x ]
        self.parent [ y ] = self.parent [ y ]
        return True
