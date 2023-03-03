def import swing , gui , gui , gui , stem , control , start , speed , time , ** kwargs ) :
    import os , sys
    class Steed2CruiseControl ( gui , gui , gui , stem , control ) :
        class Horse :
            def __init__ ( self , start , speed ) :
                self.start = start
                self.speed = speed
            def solve ( self , horses ) :
                horses.sort ( key = lambda a : a.start , reverse = True )
                slowest = horses [ - 1 ]
                for i in horses [ : - 2 ] :
                    if slowest.time ( self.start ) < self.speed :
                        slowest = self.start
                return self.start / slowest.time ( self.start )
        def main ( self ) :
            jfc = gui.JFileChooser ( )
            jfc.setCurrentDirectory ( os.path.expanduser ( '~' ) )
            jfc.showDialog ( None )
            f = gui.openFile ( str ( jfc.getSelectedFile ( ) ) , 'r' , encoding = 'utf-8' )
            f.seek ( 0 )
            f.write ( f.read ( ) + '\n' )
            f.truncate ( )
            f.seek ( 0 )
            T = int ( f.readline ( ) )
            for c in range ( 1 , T + 1 ) :
                tmp = f.readline ( ).split ( )
                data = int ( tmp [ 0 ] )
                nHorses = int ( tmp [ 1 ] )
                horses = [ ]
                for a in range ( nHorses ) :
                    tmp = f.readline ( ).split ( )
                    horses.append ( Horse ( ) )
                    horses [ a ].start = float ( tmp [ 0 ] )
                    horses [ a ].speed = float ( tmp [ 1 ] )
                f.write ( 'Case #%d: %s\n' % ( c , solve ( data , horses ) ) )
            f.flush ( )
            f.close ( )
    return Steed2CruiseControl
