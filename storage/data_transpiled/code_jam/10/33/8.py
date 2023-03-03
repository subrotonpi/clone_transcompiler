def _import ( ) :
    import sys
    import string
    import struct
    class CC ( object ) :
        def __init__ ( self ) :
            self.a = [ ]
            self.xx = [ ]
            self.yy = [ ]
        def gao ( self , ii , jj , kk ) :
            for i in range ( max ( 0 , ii - kk + 1 ) , ii + kk ) :
                for j in range ( max ( 0 , jj - kk + 1 ) , jj + kk ) :
                    self.a [ i , j , k ] = self.a [ i , j , k ]
    def gao ( self , ii , jj , kk ) :
        for i in range ( 2 , m ) :
            m , n = struct.unpack ( '>i' , struct.pack ( '>i' , i ) )
            for k in range ( 2 , kk ) :
                if i + k - 1 >= ii and j + k - 1 >= jj :
                    self.a [ i , j , k ] = False
    def gao ( self , b , z ) :
        m , n = struct.unpack ( '>i' , struct.pack ( '>i' , i ) )
        kk = max ( m , n )
        self.a = [ ]
        self.xx = [ ]
        self.yy = [ ]
        for i in range ( m ) :
            for j in range ( n ) :
                for k in range ( 1 , m ) :
                    self.xx [ i , j , k + 1 ] = self.b [ i + k , j ] != b [ i + k - 1 , j ]
                    if not self.xx [ i , j , k + 1 ] :
                        break
                for k in range ( 1 , n ) :
                    self.yy [ i , j , k + 1 ] = True
cnt = [ ]
for i in range ( m ) :
    for j in range ( 1 , m ) :
        if self.a [ i , j , k ] :
            cnt.append ( i )
return cnt
