def _import ( ) :
    import re
    import sys
    import os
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.file_name = re.sub ( '_.*' , '' , self.file_name ).lower ( )
            self.input_file_name = self.file_name + '.in'
            self.output_file_name = self.file_name + '.out'
        def solve ( self ) :
            s = self.s
            n = self.n
            a = [ self.input_file_name for self in self.a ]
            a.sort ( )
            ans = n
            created = 0
            for i in range ( n ) :
                if s == 1 :
                    break
                while s <= a [ i ] :
                    created += 1
                    s += s - 1
                s += a [ i ]
                ans = min ( ans , created + n - i - 1 )
            self.stdout.write ( ans )
        def main ( self ) :
            locale.setlocale ( locale.LC_ALL , '' )
            if len ( self.input_file_name ) >= 2 :
                self.input_file_name = self.input_file_name
                self.output_file_name = self.output_file_name
            self.stdin = open ( self.input_file_name , 'r' )
            self.stdout = open ( self.output_file_name , 'w' )
            tests = self.s
            self.stdout.readline ( )
            for t in range ( 1 , tests + 1 ) :
                self.stdout.write ( 'Case #%d: ' % t )
                A ( ).solve ( )
                print ( 'Case #%d: solved' % t )
        self.stdout.close ( )
