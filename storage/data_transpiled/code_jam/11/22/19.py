def import _import_file
import re
class B ( object ) :
    def __init__ ( self ) :
        self.file_name = re.sub ( '_.*' , '' , self.file_name )
        self.input_file_name = self.file_name + '.in'
        self.output_file_name = self.file_name + '.out'
    def solve ( self ) :
        points = self.cleaned_data [ 'points' ]
        d = self.cleaned_data [ 'd' ]
        xs = [ ]
        for i in range ( points ) :
            x = self.cleaned_data [ 'x' ]
            amount = self.cleaned_data [ 'amount' ]
            for j in range ( amount ) :
                xs.append ( x )
        xs.sort ( )
        left = 0
        right = 1e12
        self.binsearch :
        while left + 0.5e-6 < right :
            print ( right - left )
            time = ( left + right ) / 2
            p = - 1e15
            for x in xs :
                pp = max ( x - time , p + d )
                if pp > x + time :
                    if left == time :
                        break
                    left = time
                    continue
                self.binsearch
            p = pp
        if right == time :
            break
        right = time
    print ( right )
    def main ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        if len ( self.argv ) >= 2 :
            self.input_file_name = self.argv [ 0 ]
            self.output_file_name = self.argv [ 1 ]
        self.in_file = open ( self.input_file_name , 'r' )
        self.out_file = open ( self.output_file_name , 'w' )
        tests = self.cleaned_data [ 'tests' ]
        self.cleaned_data [ 'tests' ] = tests
        for t in range ( 1 , tests + 1 ) :
            print ( 'Case #%d: ' % t , end = ' ' , file = self.out_file )
            B ( self )
            print ( 'Case #%d: solved' % t , file = self.out_file )
        self.in_file.close ( )
        self.out_file.close ( )
