def import re
import os
import re
import sys
class D ( object ) :
    def __init__ ( self ) :
        self.file_name = re.sub ( '_.*' , '' , self.file_name ).lower ( )
        self.input_file_name = self.file_name + '.in'
        self.output_file_name = self.file_name + '.out'
    def solve ( self ) :
        s = self.file_name
        n = len ( s )
        a = [ ]
        q = 0
        for c in s :
            if c == '0' :
                a.append ( 0 )
            elif c == '1' :
                a.append ( 1 )
            elif c == '?' :
                a.append ( 2 )
                q += 1
        for mask in ( 1 , 2 ) :
            v = 0
            for i , j in enumerate ( a ) :
                c = c
                if c == 2 :
                    c = ( mask >> j ) & 1
                    j += 1
                v = 2 * v + c
            u = round ( math.sqrt ( v ) , 2 )
            if u ** 2 == v :
                self.out.write ( str ( v ) )
                return
        raise RuntimeError
    def main ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        if len ( self.input_file_name ) >= 2 :
            self.input_file_name = self.input_file_name
            self.output_file_name = self.output_file_name
        self.in_file = open ( self.input_file_name , 'r' )
        self.out_file = open ( self.output_file_name , 'w' )
        tests = self.input.count ( '\n' )
        self.input.read ( )
        self.output.write ( '\n' )
        for t in range ( 1 , tests + 1 ) :
            self.out.write ( 'Case #%d: ' % t )
            D ( ).solve ( )
            print ( 'Case #%d: solved' % t )
        self.input.close ( )
        self.out_file.close ( )
