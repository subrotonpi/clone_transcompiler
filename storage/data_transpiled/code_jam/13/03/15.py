def import _solve
import os
import sys
class Solver :
    def __init__ ( self ) :
        self.is_in_file , self.is_out_file = ( sys.stdin , sys.stdout )
    def write ( self , data ) :
        self.is_in_file = ( self.is_in_file )
        self.is_out_file = ( self.is_out_file )
        if self.is_out_file :
            self.write ( data )
    def writeln ( self , data ) :
        self.write ( data + os.linesep )
    def main ( self ) :
        Solver ( self ).solve ( )
    def solve ( ) :
        self.init ( )
        T = self.__next__ ( )
        for i in range ( 1 , T + 1 ) :
            write ( "Case #%d: " % i )
            self.solve_one ( )
            writeln ( "" )
    def reverse ( self ) :
        return ''.join ( reversed ( self.reverse ( ) ) )
    def is_palin ( self , num ) :
        num = str ( num )
        return num == reverse ( num )
    def islong ( self ) :
        return type ( self ) == long
    def sqrt ( self , num ) :
        return math.sqrt ( num )
    def init ( self ) :
        self.match_list = list ( )
        for i in range ( 1 , 10000000 ) :
            i_str = str ( i )
            pattern1 = i_str + reverse ( i_str )
            long1 = int ( pattern1 )
            sqrt1 = sqrt ( long1 )
            longSqrt1 = long ( sqrt1 )
            if islong ( sqrt1 ) and is_palin ( longSqrt1 ) :
                self.match_list.append ( long1 )
            pattern2 = i_str + reverse ( i_str ) [ 1 : ]
            long2 = int ( pattern2 )
            if islong ( long2 ) and is_palin ( longSqrt1 ) :
                self.match_list.append ( long2 )
    self.match_list = [ ]
