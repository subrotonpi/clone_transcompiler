def _ import _ , os , sys , subprocess , sys ) : return sys.stdout.read ( )
class Child ( object ) :
    def __init__ ( self ) :
        self.result = ''
        self.cost , self.rate , self.target = 0 , 2 , 0
    def run ( self ) :
        accu , r , time = self.target / self.r , self.target / self.r
        while True :
            accu += self.cost / self.rate
            nt = accu + self.target / self.r
            if nt > time : break
        self.result = str ( time )
class Q0B ( object ) :
    def __init__ ( self ) :
        self.cn = 0
        self.ch = [ ]
    def main ( self ) :
        jfc = subprocess.Popen ( [ './iofile' , '--' , '--' , '--' , '--' ] , stdout = subprocess.PIPE , stderr = subprocess.PIPE )
        while jfc.poll ( ) != None :
            fi = jfc.stdout.read ( )
            fo = fi.decode ( 'utf-8' )
            fo = fo [ : - 2 ] + 'out'
            fp = open ( fo , 'w' )
            q = Q0B ( )
            q.ReadInput ( fi )
            large = 'large' in fi.name
            q.PrintOutput ( fp , large )
            fp.close ( )
    def ReadInput ( self ) :
        with open ( self.fi , 'r' ) as f :
            line = f.readline ( )
            self.cn = line.count ( )
            line.close ( )
        ch = [ Child ( f ) for c in range ( cn ) ]
        f.close ( )
    def PrintOutput ( fp , large ) :
        if large :
            exec ( subprocess.Popen , stdout = subprocess.PIPE , stderr = subprocess.PIPE )
            fc = [ ]
            for c in range ( cn ) :
                fc.append ( exec ( ch [ c ] ) )
            exec ( fc )
            for c in range ( cn ) :
                while not fc [ c ].done ( ) :
                    time.sleep ( 10000 )
    