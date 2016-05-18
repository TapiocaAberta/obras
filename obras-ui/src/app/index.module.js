
import { routerConfig } from './index.route';
import { MainController } from './main/main.controller';
import { CidadeService } from '../app/cidade/cidade.service';
import { ObraService } from '../app/obra/obra.service';
import { ObraController } from '../app/obra/obra.controller';


angular.module('obrasUi', ['ngResource', 'ui.router', 'ui.bootstrap', 'ui.select', 'ngSanitize'])
  .config(routerConfig)
  //.constant('config', {uri: 'http://obras-trysoft.rhcloud.com/api/'})
  .constant('config', {uri: 'http://localhost:8080/obras-server/api/'})
  .service('cidadeService', CidadeService)
  .service('obraService', ObraService)
  .controller('MainController', MainController)
  .controller('ObraController', ObraController);
