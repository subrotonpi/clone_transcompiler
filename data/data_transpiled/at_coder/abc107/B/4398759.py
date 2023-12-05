def import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
    def __init__ ( self ) :
        self.h , self.w = self.raw_input ( ).split ( '' )
        self.a = [ ]
        self.row = [ ]
        self.column = [ ]
        for line in self.input ( ).split ( '' ) :
            self.row.append ( False )
        for line in self.input ( ).split ( '' ) :
            self.column.append ( False )
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if "#" in line :
                    self.row [ i ] = True
                    self.column [ j ] = True
    def __str__ ( self ) :
        if not self.row :
            continue
        sj = string.__new__ ( string )
        for j in range ( self.w ) :
            if not self.column :
                continue
            sj.append ( self.a [ i ] [ j ] )
        print ( sj.__str__ ( ) )
