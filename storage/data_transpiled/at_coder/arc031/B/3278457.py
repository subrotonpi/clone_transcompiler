def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.sima = [ ]
            self.test = [ ]
        def __init__ ( self ) :
            sc = open ( self.filename , 'r' )
            unko = ''
            for i in range ( 1 , 10 ) :
                unko = sc.read ( )
                for j in range ( 1 , 10 ) :
                    if unko [ j - 1 ] == 'o' :
                        self.sima.append ( [ i , j ] )
                    elif unko [ j - 1 ] == 'x' :
                        self.sima.append ( [ i , j ] )
        for i in range ( 12 ) :
            for j in range ( 12 ) :
                if i == 0 or i == 11 :
                    if j == 0 or j == 11 :
                        self.sima.append ( [ j , 0 ] )
                        self.test.append ( [ i , j ] )
    rinsetu = False
    sima_cnt = 0
    for i in range ( 1 , 10 ) :
        for j in range ( 1 , 10 ) :
            sima_cnt = 0
            for ii in range ( 12 ) :
                for jj in range ( 12 ) :
                    self.test [ ii , jj ] = self.sima [ ii , jj ]
            self.test [ i , j ] = 1
            sima_cnt = 0
            for ii in range ( 1 , 10 ) :
                for jj in range ( 1 , 10 ) :
                    if self.test [ ii , jj ] == 1 :
                        sima_cnt += 1
                        self.D_F_S ( ii , jj )
            if sima_cnt == 1 :
                print ( 'YES' )
                sys.exit ( )
    print ( 'NO' )
    sys.exit ( )
