def _ ( ) : return
import sys
import csv
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = csv.reader ( sys.stdin )
    def __init__ ( self ) :
        self.L1 = get_num_s ( self.stdout.split ( ) )
        data = self.get_data ( self.L1 [ 2 ] )
        self.stdout.close ( )
        self.white_w_start = None
        self.white_h_start = None
        self.white_w_end = self.L1 [ 0 ]
        self.white_h_end = self.L1 [ 1 ]
        for d in data :
            if d [ 2 ] == 1 :
                if self.white_w_start < d [ 0 ] :
                    self.white_w_start = d [ 0 ]
            elif d [ 2 ] == 2 :
                if self.white_w_end > d [ 0 ] :
                    self.white_w_end = d [ 0 ]
            elif d [ 2 ] == 3 :
                if self.white_h_start < d [ 1 ] :
                    self.white_h_start = d [ 1 ]
            elif d [ 2 ] == 4 :
                if self.white_h_end > d [ 1 ] :
                    self.white_h_end = d [ 1 ]
        if ( self.white_w_end - self.white_w_start < 0 or self.white_h_end - self.white_h_start < 0 ) :
            print ( 0 )
        else :
            print ( ( self.white_w_end - self.white_w_start ) * ( self.white_h_end - self.white_h_start ) )
    def get_data ( self , num ) :
        data = [ ]
        for i in range ( num ) :
            data.append ( self.get_num_s ( self.stdout.split ( ) ) )
        return data
    def get_num_s ( vals ) :
        v_ary = [ int ( v ) for v in vals ]
        return v_ary
