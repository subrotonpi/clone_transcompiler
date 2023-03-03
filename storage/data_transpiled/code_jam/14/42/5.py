def _ import _ , os , sys , code , out , code , code , sys ) :
    from os import urandom
    import random
    import locale
    import sys
    code.setlocale ( locale.LC_ALL , '' )
    class B ( object ) :
        def __init__ ( self ) :
            self.a = [ ]
            for i in range ( n ) :
                self.a.append ( randint ( 0 , 256 ) )
            self.used = [ ]
            ans = 0
            for i in range ( n ) :
                min_val , min_val_ind = sys.maxint , - 1
                for j in range ( n ) :
                    if not self.used [ j ] and a [ j ] < min_val :
                        min_val , min_val_ind = a [ j ] , j
                self.used [ min_val_ind ] = True
                count_before , count_after = 0 , 0
                for j in range ( n ) :
                    if not self.used [ j ] and j < min_val_ind :
                        count_before += 1
                    elif not self.used [ j ] and j > min_val_ind :
                        count_after += 1
                ans += min ( count_before , count_after )
            out.write ( ans )
        def run ( self ) :
            try :
                tc = randint ( 1 , 256 )
                for it in range ( 1 , tc + 1 ) :
                    sys.stderr.write ( it )
                    out.write ( 'Case #%d: ' % it )
                    self.solve ( )
            except :
                NOO ( )
            finally :
                out.close ( )
    global out
    out = open ( 'input.txt' , 'r' )
    global St
    def NOO ( self ) :
        sys.exit ( 42 )
    randint = int ( )
    randint = long ( )
    randint = float ( )
    uniform = uniform ( )
    while not St :
        try :
            line = stdin.readline ( )
            if not line : return None
            St = line.split ( )
        except :
            NOO ( )
    return B ( )
