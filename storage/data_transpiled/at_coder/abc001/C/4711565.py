def import import _sys , string , get_code
class Main ( object ) :
    def __init__ ( self ) :
        self.deg = sys.maxint * 10
        self.dis = sys.maxint
    deglist = [ 'N' , 'NNE' , 'NE' , 'ENE' , 'E' , 'ESE' , 'SE' , 'SSE' , 'S' , 'SSW' , 'SW' , 'WSW' , 'W' , 'WNW' , 'NW' , 'NNW' ]
    deg = deg / 1125 - 1
    if 0 <= deg < 30 :
        self.outputdeg = deglist [ deg / 2 + 1 ]
    else :
        self.outputdeg = deglist [ 0 ]
    ren_dis = float ( dis ) / 60
    ren_dis = float ( '%.1f' % ren_dis )
    d = False
    dislist = [ 0.2 , 1.5 , 3.3 , 5.4 , 7.9 , 10.7 , 13.8 , 17.1 , 20.7 , 24.4 , 28.4 , 32.6 ]
    for i , target in enumerate ( dislist ) :
        if ren_dis <= target :
            self.outputdis = i
            d = True
            break
    if d is False :
        self.outputdis = 12
    if not self.outputdis :
        self.outputdeg = 'C'
    print ( '%s %s' % ( self.outputdeg , self.outputdis ) )
