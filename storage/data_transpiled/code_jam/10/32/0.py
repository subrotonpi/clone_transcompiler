def import _import_py2exe_file
import re
class B ( object ) :
    def __init__ ( self ) :
        self.file_name = re.sub ( '_.*' , '' , self.file_name )
        self.input_filename = self.file_name + '.in'
        self.output_filename = self.file_name + '.out'
    def solve ( self ) :
        lo , hi , c = self.inputs [ 0 ] , self.inputs [ 1 ] , self.outputs [ 1 ]
        n = 0
        while lo < hi :
            lo *= c
            n += 1
        self.outputs [ 0 ] = 32 - int ( n - 1 )
    def main ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        if len ( self.inputs ) >= 2 :
            self.input_filename = self.inputs [ 0 ]
            self.output_filename = self.outputs [ 0 ]
        self.inputs = open ( self.input_filename , 'r' )
        self.outputs = open ( self.output_filename , 'w' )
        tests = self.inputs [ 1 ]
        self.inputs.remove ( self.input_filename )
        for t in range ( 1 , tests + 1 ) :
            self.outputs.write ( 'Case #%d: ' % t )
            B ( ).solve ( )
        self.outputs.write ( '\n' )
