def world2014.qualification_round ( ) :
    import os
    import sys
    from os import path
    from os import rename
    from os import getcwd
    from os.path import join
    from os import sep
    from os import rename
    from os import sep
    from os import chdir
    class DeceitfulWar ( ) :
        def solve ( self , N , naomi , ken ) :
            naomi = [ float ( i ) for i in naomi.split ( sep ) ]
            ken = [ float ( i ) for i in ken.split ( sep ) ]
            return [ self.win_deeitfulWar ( N , naomi , ken ) , self.winWar ( N , naomi , ken ) ]
        def win_deeitfulWar ( self , N , naomi , ken ) :
            win = 0
            kidx = 0
            for i in range ( N ) :
                if naomi [ i ] > ken [ kidx ] :
                    win += 1
                    kidx += 1
            return win
        def winWar ( self , N , naomi , ken ) :
            win = 0
            kidx = N - 1
            for i in range ( N - 1 , - 1 , - 1 ) :
                if naomi [ i ] > ken [ kidx ] :
                    win += 1
                else :
                    kidx -= 1
            return win
        def main ( self , args ) :
            input_path = 'file/world2014/qualification_round/D-large.in'
            output_path = input_path.split ( '.' ) [ 0 ] + '.out'
            f = open ( input_path , 'r' )
            f.write ( '\n'.join ( [ 'Case #' + str ( i + 1 ) + ': ' + str ( res [ 0 ] ) + ' ' + str ( res [ 1 ] ) for i in args ] ) )
            f.close ( )
            return [ ]
    return DeceitfulWar ( ).solve ( N , naomi , ken )
