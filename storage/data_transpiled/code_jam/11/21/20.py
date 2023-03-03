def main ( ) :
    from locale import getpreferredencoding
    import re
    import os
    import sys
    import os
    if len ( sys.argv ) >= 2 :
        input_filename = sys.argv [ 1 ]
        output_filename = sys.argv [ 2 ]
    f = open ( input_filename , 'r' )
    f.write ( 'Case #%d: ' % t )
    f.write ( 'Case #%d: solved\n' )
    f.close ( )
    print ( 'Case #%d: solved\n' % t )
