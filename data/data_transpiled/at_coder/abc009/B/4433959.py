def _import ( ) :
    import sys
    class Main ( object ) :
        def solve ( self ) :
            n = randint ( 0 , 1024 )
            self.set = [ ]
            for i in range ( n ) : self.set.append ( randint ( 0 , i ) )
            self.poll_last ( )
            self.write ( self.set.pop ( ) )
        def read ( self ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def read ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
        def write ( self , n ) :
            self.set.append ( self.set.pop ( ) )
    return Main ( )
