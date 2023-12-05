def package.year2009.round1B.a ; import os , os , sys , os , sys , os.path
class ProblemA :
    def __init__ ( self ) :
        self.FILE_PREFIX = 'A'
    def run ( self ) :
        with open ( self.get_input_file ( ) , 'r' ) as infile :
            with open ( self.FILE_PREFIX + '-large.txt' , 'w' ) as outfile :
                COUNT = self.COUNT
                for pass in range ( COUNT ) :
                    values = infile.read ( ).strip ( ).split ( '\n' )
                    assoc = { }
                    next = 1
                    for value in values :
                        if value in assoc :
                            continue
                        assoc [ value ] = next
                        if next == 1 :
                            next = 0
                        elif next == 0 :
                            next = 2
                        else :
                            next += 1
                    base = len ( assoc )
                    ans = 0
                    if base == 1 :
                        base = 2
                    for value in values :
                        ans = ans * base + assoc [ value ]
                        sys.stderr.write ( assoc [ value ] + ' ' )
                    sys.stderr.write ( '     ' + str ( base ) + '       ' )
                    sys.stderr.write ( ans )
                    outfile.write ( 'Case #%d: ' % ( pass + 1 ) )
                    outfile.write ( ans )
                    outfile.write ( '\n' )
                outfile.close ( )
                infile.close ( )
    def get_input_file ( self ) :
        with open ( self.FILE_PREFIX + '-large.txt' , 'r' ) as infile :
            result = None
            temp = os.path.join ( self.FILE_PREFIX , 'input' , self.FILE_PREFIX + '.txt' )
            if os.path.exists ( temp ) :
                result = temp
            temp = os.path.join ( self.FILE_PREFIX , 'input' , self.FILE_PREFIX + '-large.txt' )
            if os.path.exists ( temp ) :
                result = temp
    return
