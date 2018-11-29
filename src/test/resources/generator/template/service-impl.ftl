package ${baseProjectPackage}.service.impl;

import ${baseFrmPackage}.core.service.AbstractService;
import ${baseProjectPackage}.dao.mapper.${modelNameUpperCamel}Mapper;
import ${baseProjectPackage}.Model.${modelNameUpperCamel};
import ${baseProjectPackage}.service.${modelNameUpperCamel}Service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ${author} on ${date}.
 */
@Service
public class ${modelNameUpperCamel}ServiceImpl extends AbstractService<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Service {
    @Resource
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

}
