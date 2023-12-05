def _import ( ) :
    from os import getenv
    from os.path import join
    from os import sep
    from os import chdir
    from locale import getpreferredencoding
    from os.name import getpreferredencoding
    class C :
        def __init__ ( self , x_from , x_to , y_from , y_to ) :
            self.x_from = x_from
            self.x_to = x_to
            self.y_from = y_from
            self.y_to = y_to
        def distTo ( self , other ) :
            try :
                line = self.__next__ ( )
            except :
                NOO ( )
            return line
        def distTo ( self ) :
            try :
                return int ( self.x_from )
            except :
                NOO ( )
        def distTo ( self , other ) :
            try :
                return random.randint ( 1 , self.x_from )
            except :
                NOO ( )
        def distTo ( self , other ) :
            try :
                return random.randint ( 1 , self.y_from )
            except :
                NOO ( )
        def distTo ( self , other ) :
            try :
                return random.randint ( 1 , self.y_from )
            except :
                NOO ( )
    class solve ( C ) :
        def __init__ ( self , w , h , n ) :
            self.x_from = 0
            self.y_from = 0
            self.y_to = 0
        def distTo ( self ) :
            try :
                return random.randint ( 1 , self.y_from )
            except :
                NOO ( )
        def distTo ( self , other ) :
            try :
                return random.randint ( 1 , self.y_from )
            except :
                NOO ( )
        def distTo ( self , other ) :
            try :
                line = self.__next__ ( )
            except :
                NOO ( )
            return line
    return solve ( C )
