def _import ( ) :
    from os import open
    from os import rename
    from os import system , getcwd
    from os.path import join
    from os import sep
    from os import chdir
    class Rotate ( ) :
        def __init__ ( self , args ) :
            self.stdin = open ( 'A-large.in' , 'r' )
            self.stdout = open ( 'A.out' , 'w' )
            self.stdout = open ( 'A.out' , 'w' )
            self.N , self.K , self.cases = int ( self.stdin.readline ( ) ) , int ( self.stdin.readline ( ) ) , int ( self.stdin.readline ( ) )
            self.gold = ( 1 + math.sqrt ( 5 ) ) / 2
            for i in range ( 1 , self.cases + 1 ) :
                self.streak = 0
                for r in range ( 0 , self.N - 1 ) :
                    if self.gold + r < 0 or self.gold + r >= self.N :
                        self.streak = 1
                else :
                    self.streak += 1
            self.stdout.write ( 'Case #%d: %s\n' % ( self.i , self.red and 'Red' or 'Neither' ) )
    for sum in range ( 2 * N - 1 ) :
        last = '.'
        for r in range ( 0 , self.N ) :
            if self.gold + r < 0 or self.gold + r >= self.N :
                continue
            if self.red :
                if self.blue :
                    self.red = True
            else :
                self.blue = True
    for diff in range ( 1 , self.N - 1 ) :
        last = '.'
        for r in range ( 0 , self.N ) :
            if self.gold + r < 0 or self.gold + r >= self.N :
                continue
            if self.red :
                self.red = True
            if self.blue :
                self.blue = True
    print ( 'Both' , 'Red' , 'Blue' , 'Neither' )
