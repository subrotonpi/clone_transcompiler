def import datetime
class Main ( object ) :
    def __init__ ( self ) :
        self.y = 0
        self.m = 0
        self.d = 0
    def input ( self ) :
        with open ( self.filename , 'r' ) as f :
            data = f.read ( )
            date = data.split ( '/' , 1 )
            self.y = int ( date [ 0 ] )
            self.m = int ( date [ 1 ] )
            self.d = int ( date [ 2 ] )
    def main ( self , args ) :
        self.input ( )
        self.date = datetime.date ( self.y , ( self.m - 1 ) , self.d )
        answer = ''
        while True :
            year = self.date.year
            month = self.date.month + 1
            day = self.date.day
            if ( year % ( month * day ) ) == 0 :
                answer = '{}/{}/{}'.format ( year , ( month if month >= 10 else '0' ) + month , ( day if day >= 10 else '0' ) + day )
                break
            self.date += datetime.timedelta ( days = 1 )
        print ( answer )
