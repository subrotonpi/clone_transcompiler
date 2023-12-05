def import _readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.proscan = proconscan ( '' )
        self.n_integer = self.proscan.scan_integer1 ( )
        self.a_integer = [ ]
        self.t_integer = [ ]
        self.a_ansi = 1
        self.t_ansi = 1
        self.aBuf = 0
        self.t_buf = 0
        self.max = 0
        for i in range ( self.n_integer ) :
            self.scan ( )
            self.a_integer = int ( self.proscan.string [ 1 ] )
            self.t_integer = int ( self.proscan.string [ 0 ] )
            self.aBuf = self.a_ansi / self.a_integer + ( self.a_ansi % self.a_integer == 0 )
            self.t_buf = self.t_ansi / self.t_integer + ( self.t_ansi % self.t_integer == 0 )
            self.max = max ( self.aBuf , self.t_buf )
            self.a_ansi = self.a_ansi * self.max
            self.t_ansi = self.t_ansi * self.max
        print ( ( self.a_ansi + self.t_ansi ) )
        self.proscan.procon_end ( )
    def proscan ( self ) :
        self.readline = readline
        self.in_line = ''
        self.in_string = ''
        self.idx = 0
        self.split_char = ''
        self.idx = 0
        self.split_char = ''
        self.scan ( )
        self.idx = 0
        self.in_line = self.in_line.split ( self.split_char , 1 ) [ 0 ]
        return in_line
    def scan_integer1 ( self ) :
        self.scan ( )
        return int ( self.in_string [ 0 ] )
    def back_line ( self ) :
        self.line = ''
        self.idx = 0
        self.in_line = ''
        self.end_line ( )
