def round0 ( ) :
    import os
    import csv
    import os
    import sys
    import csv
    import os
    import subprocess
    import subprocess
    class StandingOvation ( subprocess.Popen ) :
        def __init__ ( self ) :
            subprocess.Popen ( self.cmd )
        def communicate ( self ) :
            file = open ( 'round0/A-large.in' , 'r' )
            reader = csv.reader ( file )
            output_file = open ( 'round0/output-ovation.txt' , 'w' )
            self.output_file = output_file
            self.number_of_performances = int ( reader.readline ( ) )
            for show in range ( 1 , number_of_performances + 1 ) :
                split = reader.readline ( ).split ( )
                length = int ( split [ 0 ] )
                audience = split [ 1 ]
                self.generate_output ( 'Case #%d: %d' % ( show , self.invited_friends ( length , audience ) ) )
    def invited_friends ( length , audience ) :
        friends = 0
        total_standing = 0
        for i in range ( length + 1 ) :
            total_standing += int ( '%s' % audience [ i ] )
            if total_standing < i + 1 :
                friends += 1
                total_standing += 1
        return friends
    def generate_output ( line ) :
        print ( line )
        open ( 'round0/output-ovation.txt' , 'w' ).write ( line + '\n' )
