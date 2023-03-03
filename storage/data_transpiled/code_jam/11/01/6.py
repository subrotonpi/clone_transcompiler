def import _bot
class Bot ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.nb_case = self.nb_case
        self.nb_buttons = self.nb_buttons
        self.color = 0
        self.button = 0
        self.pos = [ ]
        self.time = [ ]
        for num_test in range ( 1 , self.nb_case + 1 ) :
            self.s.readline ( )
            print ( "Case #" , end = "" )
            print ( num_test , end = "" )
            print ( ": " , end = "" )
            self.pos.append ( 1 )
            self.time.append ( 0 )
            self.nb_buttons = self.nb_buttons
            for num_button in range ( self.nb_buttons ) :
                color = ( self.color [ 0 ] == "B" )
                button = self.button [ 1 ]
                self.time.append ( abs ( self.pos [ color ] - button ) )
                self.time.append ( max ( self.time ) + 1 )
                self.pos [ color ] = button
            print ( max ( self.time ) )
